package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Tc.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.33f, 3.04f)
                lineTo(13.33f, 14.04f)
                curveToRelative(0.1f, 0.1f, 0.41f, 0.28f, 0.71f, 0f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0f, -0.71f)
                lineTo(3.04f, 2.33f)
                curveToRelative(1.06f, -0.3f, 3.26f, -0.66f, 6.1f, 0.25f)
                curveToRelative(0.27f, 0.09f, 0.55f, -0.06f, 0.63f, -0.33f)
                curveToRelative(0.08f, -0.26f, -0.06f, -0.54f, -0.33f, -0.63f)
                curveToRelative(-4.4f, -1.4f, -7.41f, -0.01f, -7.53f, 0.05f)
                curveToRelative(-0.1f, 0.05f, -0.19f, 0.13f, -0.24f, 0.24f)
                curveToRelative(-0.06f, 0.13f, -1.45f, 3.13f, -0.05f, 7.53f)
                curveToRelative(0.07f, 0.21f, 0.27f, 0.36f, 0.48f, 0.35f)
                curveToRelative(0.44f, -0.03f, 0.56f, -0.39f, 0.48f, -0.65f)
                curveToRelative(-0.9f, -2.82f, -0.54f, -5.03f, -0.24f, -6.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.69f, 4.38f)
                curveToRelative(-1.32f, 0f, -2.44f, 0.11f, -3.42f, 0.33f)
                curveToRelative(-0.27f, 0.06f, -0.44f, 0.33f, -0.38f, 0.6f)
                curveToRelative(0.06f, 0.27f, 0.33f, 0.44f, 0.6f, 0.38f)
                curveToRelative(0.91f, -0.21f, 1.96f, -0.31f, 3.2f, -0.31f)
                curveToRelative(5.91f, 0f, 8.31f, 2.41f, 8.31f, 8.31f)
                reflectiveCurveToRelative(-2.41f, 8.31f, -8.31f, 8.31f)
                reflectiveCurveToRelative(-8.31f, -2.41f, -8.31f, -8.31f)
                curveToRelative(0f, -1.2f, 0.11f, -2.27f, 0.32f, -3.19f)
                curveToRelative(0.06f, -0.27f, -0.11f, -0.54f, -0.38f, -0.6f)
                curveToRelative(-0.27f, -0.06f, -0.54f, 0.11f, -0.6f, 0.38f)
                curveToRelative(-0.23f, 0.99f, -0.34f, 2.14f, -0.34f, 3.41f)
                curveToRelative(0f, 8.25f, 4.98f, 9.31f, 9.31f, 9.31f)
                reflectiveCurveToRelative(9.31f, -1.06f, 9.31f, -9.31f)
                reflectiveCurveTo(18.02f, 4.38f, 13.69f, 4.38f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
