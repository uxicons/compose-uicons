package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Sc.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.44f, 18.17f)
                curveToRelative(-0.15f, -0.23f, -0.39f, -0.38f, -0.65f, -0.43f)
                curveToRelative(-3.78f, -0.7f, -7.79f, -0.7f, -11.57f, 0f)
                curveToRelative(-0.27f, 0.05f, -0.51f, 0.21f, -0.65f, 0.43f)
                curveToRelative(-0.09f, 0.14f, -0.89f, 1.41f, -0.89f, 3.13f)
                curveToRelative(0f, 0.29f, 0.02f, 0.57f, 0.06f, 0.84f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.85f, 0.99f, 0.85f)
                horizontalLineToRelative(12.55f)
                curveToRelative(0.49f, 0f, 0.92f, -0.36f, 0.99f, -0.85f)
                curveToRelative(0.04f, -0.27f, 0.06f, -0.55f, 0.06f, -0.84f)
                curveToRelative(0f, -1.73f, -0.8f, -3.0f, -0.89f, -3.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.62f, 8.62f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.07f, -0.38f, 0.08f, -0.74f, 0.08f, -1.05f)
                curveToRelative(-0.01f, -2.36f, -1.17f, -3.56f, -3.46f, -3.57f)
                curveToRelative(-1.15f, -0.03f, -1.98f, 0.28f, -2.57f, 0.88f)
                curveToRelative(-0.8f, 0.8f, -0.89f, 1.91f, -0.88f, 2.68f)
                curveToRelative(0.0f, 0.39f, 0.03f, 0.74f, 0.1f, 1.07f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.18f, 15.61f)
                lineToRelative(-1.04f, -5.09f)
                horizontalLineTo(7.86f)
                lineToRelative(-1.04f, 5.09f)
                curveToRelative(1.7f, -0.26f, 3.44f, -0.4f, 5.18f, -0.4f)
                reflectiveCurveToRelative(3.48f, 0.13f, 5.18f, 0.4f)
                close()
            }
        }.also { _ChessPawnAlt = it}
