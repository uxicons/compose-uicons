package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle90: ImageVector? = null

val Icons.Rs.Angle90: ImageVector
    get() = _Angle90 ?: UXIcon(name = "Angle90") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.61f, 13.52f)
                curveToRelative(-0.67f, -1.5f, -1.56f, -2.87f, -2.63f, -4.08f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(1.27f, 1.42f, 2.33f, 3.04f, 3.11f, 4.82f)
                lineToRelative(-1.89f, 0.68f)
                close()
                moveTo(15.98f, 6.6f)
                curveToRelative(-1.42f, -1.27f, -3.04f, -2.33f, -4.82f, -3.11f)
                lineToRelative(-0.68f, 1.89f)
                curveToRelative(1.5f, 0.67f, 2.87f, 1.56f, 4.08f, 2.63f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(20f, 20.0f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.84f, -0.28f, -3.62f, -0.8f, -5.29f)
                lineToRelative(-1.89f, 0.68f)
                curveToRelative(0.44f, 1.46f, 0.68f, 3.01f, 0.68f, 4.61f)
                close()
                moveTo(9.29f, 2.8f)
                curveToRelative(-1.67f, -0.52f, -3.45f, -0.8f, -5.29f, -0.8f)
                verticalLineToRelative(2f)
                curveToRelative(1.6f, 0f, 3.15f, 0.24f, 4.61f, 0.68f)
                lineToRelative(0.68f, -1.89f)
                close()
                moveTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-2f)
                lineTo(3f, 22f)
                close()
            }
        }.also { _Angle90 = it}
