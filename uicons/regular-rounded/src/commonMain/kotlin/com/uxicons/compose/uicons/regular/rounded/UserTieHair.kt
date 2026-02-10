package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Rr.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.92f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(11.92f, 2f)
                curveToRelative(0.4f, 0f, 0.77f, 0.07f, 1.13f, 0.18f)
                curveToRelative(-0.76f, 1.69f, -2.45f, 2.82f, -4.34f, 2.82f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.02f, -0.63f, -0.05f)
                curveToRelative(0.46f, -1.7f, 2.0f, -2.95f, 3.84f, -2.95f)
                close()
                moveTo(8.71f, 7f)
                curveToRelative(2.62f, 0f, 4.94f, -1.51f, 6.06f, -3.8f)
                curveToRelative(0.71f, 0.72f, 1.15f, 1.71f, 1.15f, 2.8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                curveToRelative(-1.88f, 0f, -3.44f, -1.3f, -3.87f, -3.05f)
                curveToRelative(0.22f, 0.02f, 0.44f, 0.05f, 0.66f, 0.05f)
                close()
                moveTo(21.0f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.02f, -1.93f, -5.59f, -4.61f, -6.57f)
                lineToRelative(-1.52f, 2.28f)
                lineToRelative(1.09f, 3.99f)
                curveToRelative(0.18f, 0.67f, -0.41f, 1.3f, -1.2f, 1.3f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(-0.8f, 0f, -1.38f, -0.64f, -1.2f, -1.3f)
                lineToRelative(1.09f, -3.99f)
                lineToRelative(-1.52f, -2.28f)
                curveToRelative(-2.68f, 0.98f, -4.61f, 3.55f, -4.61f, 6.57f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _UserTieHair = it}
