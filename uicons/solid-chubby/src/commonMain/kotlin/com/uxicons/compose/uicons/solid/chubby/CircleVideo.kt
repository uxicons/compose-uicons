package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleVideo: ImageVector? = null

val Icons.Sc.CircleVideo: ImageVector
    get() = _CircleVideo ?: UXIcon(name = "CircleVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.32f, 10.23f)
                curveToRelative(0.09f, 0.39f, 0.18f, 1.0f, 0.18f, 1.77f)
                reflectiveCurveToRelative(-0.1f, 1.38f, -0.18f, 1.77f)
                curveToRelative(-0.49f, 0.1f, -1.35f, 0.23f, -2.57f, 0.23f)
                reflectiveCurveToRelative(-2.08f, -0.13f, -2.57f, -0.23f)
                curveToRelative(-0.09f, -0.39f, -0.18f, -1.0f, -0.18f, -1.77f)
                reflectiveCurveToRelative(0.1f, -1.39f, 0.18f, -1.77f)
                curveToRelative(0.49f, -0.1f, 1.35f, -0.23f, 2.57f, -0.23f)
                reflectiveCurveToRelative(2.08f, 0.13f, 2.57f, 0.23f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, -0.36f, -0.19f, -0.69f, -0.51f, -0.87f)
                curveToRelative(-0.31f, -0.18f, -0.7f, -0.17f, -1.01f, 0.01f)
                curveToRelative(-0.25f, 0.15f, -0.71f, 0.44f, -1.18f, 0.81f)
                curveToRelative(-0.11f, -0.53f, -0.22f, -0.85f, -0.24f, -0.91f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.49f, -0.6f, -0.59f)
                curveToRelative(-0.13f, -0.05f, -1.36f, -0.46f, -3.71f, -0.46f)
                reflectiveCurveToRelative(-3.58f, 0.41f, -3.71f, 0.46f)
                curveToRelative(-0.28f, 0.1f, -0.5f, 0.32f, -0.6f, 0.59f)
                curveToRelative(-0.04f, 0.12f, -0.44f, 1.22f, -0.44f, 2.95f)
                reflectiveCurveToRelative(0.39f, 2.83f, 0.44f, 2.95f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.49f, 0.6f, 0.59f)
                curveToRelative(0.13f, 0.05f, 1.36f, 0.46f, 3.71f, 0.46f)
                reflectiveCurveToRelative(3.58f, -0.41f, 3.71f, -0.46f)
                curveToRelative(0.28f, -0.1f, 0.5f, -0.32f, 0.6f, -0.59f)
                curveToRelative(0.02f, -0.06f, 0.14f, -0.38f, 0.24f, -0.91f)
                curveToRelative(0.42f, 0.35f, 0.87f, 0.66f, 1.25f, 0.85f)
                curveToRelative(0.31f, 0.15f, 0.68f, 0.14f, 0.97f, -0.04f)
                curveToRelative(0.29f, -0.18f, 0.47f, -0.5f, 0.47f, -0.85f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _CircleVideo = it}
