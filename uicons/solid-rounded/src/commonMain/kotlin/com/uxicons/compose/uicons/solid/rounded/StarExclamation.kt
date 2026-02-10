package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarExclamation: ImageVector? = null

val Icons.Sr.StarExclamation: ImageVector
    get() = _StarExclamation ?: UXIcon(name = "StarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.84f, 8.6f)
                curveToRelative(-0.44f, -1.35f, -1.65f, -2.23f, -3.07f, -2.23f)
                horizontalLineToRelative(-4.37f)
                lineToRelative(-1.33f, -4.14f)
                curveToRelative(-0.44f, -1.36f, -1.64f, -2.24f, -3.07f, -2.24f)
                reflectiveCurveToRelative(-2.64f, 0.88f, -3.07f, 2.24f)
                lineToRelative(-1.33f, 4.14f)
                lineTo(3.23f, 6.38f)
                curveToRelative(-1.42f, 0f, -2.63f, 0.87f, -3.07f, 2.23f)
                reflectiveCurveToRelative(0.02f, 2.77f, 1.16f, 3.61f)
                lineToRelative(3.56f, 2.6f)
                lineToRelative(-1.35f, 4.18f)
                curveToRelative(-0.44f, 1.36f, 0.03f, 2.77f, 1.18f, 3.61f)
                curveToRelative(0.57f, 0.41f, 1.23f, 0.62f, 1.89f, 0.62f)
                curveToRelative(0.67f, 0f, 1.33f, -0.21f, 1.91f, -0.64f)
                lineToRelative(3.48f, -2.56f)
                lineToRelative(3.48f, 2.56f)
                curveToRelative(1.15f, 0.85f, 2.64f, 0.85f, 3.8f, 0.02f)
                curveToRelative(1.16f, -0.83f, 1.62f, -2.25f, 1.18f, -3.61f)
                lineToRelative(-1.35f, -4.18f)
                lineToRelative(3.56f, -2.6f)
                curveToRelative(1.15f, -0.84f, 1.6f, -2.25f, 1.16f, -3.61f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _StarExclamation = it}
