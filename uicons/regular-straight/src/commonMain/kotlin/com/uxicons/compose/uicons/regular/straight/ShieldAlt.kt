package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Rs.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 2.63f)
                lineTo(12f, 0f)
                lineToRelative(-7.95f, 2.63f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.84f)
                verticalLineToRelative(6.47f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-6.47f)
                curveToRelative(0f, -1.29f, -0.82f, -2.44f, -2.06f, -2.84f)
                close()
                moveTo(4f, 11.95f)
                verticalLineToRelative(-6.47f)
                curveToRelative(0f, -0.43f, 0.27f, -0.81f, 0.68f, -0.94f)
                lineToRelative(6.32f, -2.09f)
                verticalLineToRelative(18.8f)
                curveToRelative(-2.48f, -1.42f, -7f, -4.65f, -7f, -9.3f)
                close()
                moveTo(20f, 11.95f)
                curveToRelative(0f, 5.36f, -4.57f, 8.27f, -7f, 9.44f)
                lineTo(13f, 2.44f)
                lineToRelative(6.32f, 2.09f)
                curveToRelative(0.41f, 0.14f, 0.68f, 0.52f, 0.68f, 0.94f)
                verticalLineToRelative(6.47f)
                close()
            }
        }.also { _ShieldAlt = it}
