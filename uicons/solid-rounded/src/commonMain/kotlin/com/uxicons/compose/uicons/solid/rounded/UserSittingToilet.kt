package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Sr.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.93f, 17.09f)
                lineTo(18.49f, 23.23f)
                curveToRelative(-0.11f, 0.46f, -0.52f, 0.77f, -0.97f, 0.77f)
                curveToRelative(-0.64f, 0.01f, -1.13f, -0.61f, -0.97f, -1.23f)
                lineToRelative(1.44f, -6.14f)
                curveToRelative(0.03f, -0.4f, -0.1f, -0.57f, -0.5f, -0.63f)
                horizontalLineToRelative(-6.49f)
                curveToRelative(-1.88f, 0.05f, -3.43f, -1.9f, -2.91f, -3.71f)
                lineToRelative(1.75f, -4.95f)
                curveToRelative(0.17f, -0.75f, 0.61f, -1.4f, 1.25f, -1.83f)
                curveToRelative(0.66f, -0.45f, 1.46f, -0.61f, 2.25f, -0.46f)
                curveToRelative(0.79f, 0.15f, 1.43f, 0.71f, 1.92f, 1.27f)
                curveToRelative(0.01f, 0.01f, 4.11f, 5.06f, 4.11f, 5.06f)
                curveToRelative(0.35f, 0.43f, 0.28f, 1.06f, -0.14f, 1.41f)
                curveToRelative(-0.43f, 0.35f, -1.06f, 0.29f, -1.41f, -0.14f)
                lineToRelative(-3.2f, -3.82f)
                lineToRelative(-1.61f, 5.19f)
                horizontalLineToRelative(4.49f)
                curveToRelative(0.77f, 0f, 1.49f, 0.35f, 1.97f, 0.95f)
                curveToRelative(0.48f, 0.6f, 0.65f, 1.38f, 0.48f, 2.14f)
                close()
                moveTo(5f, 17f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, 0f, 0f, -1f, 1f, -1f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.96f, 0f, 4.29f, -1.83f, 4.77f, -3.47f)
                curveToRelative(0.22f, -0.76f, -0.36f, -1.53f, -1.15f, -1.53f)
                close()
            }
        }.also { _UserSittingToilet = it}
