package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmokingBan: ImageVector? = null

val Icons.Rc.SmokingBan: ImageVector
    get() = _SmokingBan ?: UXIcon(name = "SmokingBan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 2.74f, -0.43f, 4.75f, -1.41f, 6.18f)
                lineToRelative(-2.38f, -2.38f)
                curveToRelative(0.41f, -0.04f, 0.75f, -0.07f, 1.0f, -0.1f)
                curveToRelative(0.41f, -0.05f, 0.74f, -0.29f, 0.82f, -0.62f)
                curveToRelative(0.07f, -0.27f, 0.13f, -0.63f, 0.13f, -1.07f)
                reflectiveCurveToRelative(-0.06f, -0.8f, -0.13f, -1.07f)
                curveToRelative(-0.09f, -0.33f, -0.41f, -0.57f, -0.82f, -0.62f)
                curveToRelative(-0.81f, -0.1f, -2.41f, -0.25f, -4.78f, -0.3f)
                lineToRelative(-7.61f, -7.61f)
                curveToRelative(1.43f, -0.97f, 3.44f, -1.41f, 6.18f, -1.41f)
                curveToRelative(6.56f, 0f, 9f, 2.44f, 9f, 9f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.74f, 0.43f, -4.75f, 1.41f, -6.18f)
                lineToRelative(13.77f, 13.77f)
                curveToRelative(-1.43f, 0.97f, -3.44f, 1.41f, -6.18f, 1.41f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                close()
                moveTo(12.5f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(3.45f, 0f, 4.14f, 1.9f, 4.59f, 3.15f)
                curveToRelative(0.17f, 0.48f, 0.32f, 0.89f, 0.57f, 1.1f)
                curveToRelative(0.41f, 0.37f, 0.45f, 1.0f, 0.08f, 1.41f)
                curveToRelative(-0.37f, 0.41f, -1.0f, 0.45f, -1.41f, 0.08f)
                curveToRelative(-0.62f, -0.55f, -0.89f, -1.28f, -1.12f, -1.91f)
                curveToRelative(-0.42f, -1.14f, -0.67f, -1.83f, -2.72f, -1.83f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(7.91f, 12.13f)
                lineTo(11.78f, 16.0f)
                curveToRelative(-2.95f, -0.01f, -4.9f, -0.19f, -5.82f, -0.31f)
                curveToRelative(-0.41f, -0.05f, -0.74f, -0.29f, -0.82f, -0.62f)
                curveToRelative(-0.07f, -0.27f, -0.13f, -0.63f, -0.13f, -1.07f)
                reflectiveCurveToRelative(0.06f, -0.8f, 0.13f, -1.07f)
                curveToRelative(0.09f, -0.33f, 0.41f, -0.57f, 0.82f, -0.62f)
                curveToRelative(0.43f, -0.05f, 1.09f, -0.12f, 1.95f, -0.18f)
                close()
            }
        }.also { _SmokingBan = it}
