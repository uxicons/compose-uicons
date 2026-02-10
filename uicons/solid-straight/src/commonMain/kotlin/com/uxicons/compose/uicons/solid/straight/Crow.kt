package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crow: ImageVector? = null

val Icons.Ss.Crow: ImageVector
    get() = _Crow ?: UXIcon(name = "Crow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.66f, 15f)
                reflectiveCurveToRelative(7.11f, -8.87f, 7.34f, -9.31f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 3.0f, -2.38f, 5.44f, -5.3f, 5.44f)
                horizontalLineToRelative(-2.04f)
                close()
                moveTo(22f, 3.52f)
                curveToRelative(0f, -0.01f, 0f, -0.02f, 0f, -0.02f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.06f)
                curveToRelative(0f, 4.1f, -3.27f, 7.44f, -7.3f, 7.44f)
                horizontalLineToRelative(-3.64f)
                lineTo(0.05f, 22.02f)
                lineToRelative(1.56f, 1.25f)
                lineToRelative(1.81f, -2.27f)
                horizontalLineToRelative(5.44f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(2.24f)
                lineToRelative(-1.53f, -3.06f)
                curveToRelative(0.85f, -0.09f, 1.68f, -0.29f, 2.48f, -0.58f)
                lineToRelative(1.82f, 3.64f)
                horizontalLineToRelative(2.24f)
                lineToRelative(-2.24f, -4.49f)
                curveToRelative(3.34f, -1.95f, 5.64f, -5.6f, 5.64f, -9.69f)
                curveToRelative(0f, 0f, 0.0f, -2.79f, 0.01f, -2.83f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0f, -1.89f, -1.08f, -2.93f, -2f, -3.48f)
                close()
            }
        }.also { _Crow = it}
