package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretUp: ImageVector? = null

val Icons.Ts.CaretUp: ImageVector
    get() = _CaretUp ?: UXIcon(name = "CaretUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.25f, 15f)
                lineTo(4.7f, 15f)
                lineToRelative(5.81f, -6.35f)
                curveToRelative(0.38f, -0.43f, 0.95f, -0.65f, 1.51f, -0.65f)
                curveToRelative(0.55f, 0.01f, 1.07f, 0.25f, 1.44f, 0.66f)
                lineToRelative(5.8f, 6.34f)
                close()
                moveTo(6.96f, 14f)
                horizontalLineToRelative(10.02f)
                lineToRelative(-4.27f, -4.67f)
                curveToRelative(-0.19f, -0.21f, -0.44f, -0.33f, -0.72f, -0.33f)
                curveToRelative(-0.3f, 0.01f, -0.56f, 0.11f, -0.75f, 0.33f)
                lineToRelative(-4.28f, 4.67f)
                close()
            }
        }.also { _CaretUp = it}
