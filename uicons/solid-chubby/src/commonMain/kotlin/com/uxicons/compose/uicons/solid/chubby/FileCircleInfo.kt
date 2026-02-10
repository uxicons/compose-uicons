package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCircleInfo: ImageVector? = null

val Icons.Sc.FileCircleInfo: ImageVector
    get() = _FileCircleInfo ?: UXIcon(name = "FileCircleInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                reflectiveCurveToRelative(1.85f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.85f, 6f, -6f)
                reflectiveCurveToRelative(-1.85f, -6f, -6f, -6f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15.75f, 6.73f)
                curveToRelative(-0.12f, -0.9f, -0.29f, -2.69f, -0.23f, -5.33f)
                curveToRelative(0.14f, 0.08f, 0.27f, 0.17f, 0.38f, 0.29f)
                curveToRelative(1.19f, 1.17f, 4.16f, 4.07f, 5.35f, 5.25f)
                curveToRelative(0.01f, 0.01f, 0.03f, 0.03f, 0.04f, 0.05f)
                curveToRelative(-2.33f, 0.1f, -4.48f, -0.12f, -5.54f, -0.27f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 2.62f, 0.69f, 4.62f, 2.04f, 5.97f)
                curveToRelative(-2.18f, -0.08f, -4.61f, -0.39f, -7.24f, -0.98f)
                curveToRelative(-0.4f, -0.09f, -0.72f, -0.41f, -0.8f, -0.81f)
                curveToRelative(-0.66f, -3.09f, -1f, -6.22f, -1f, -9.19f)
                reflectiveCurveToRelative(0.34f, -6.09f, 1.0f, -9.19f)
                curveToRelative(0.09f, -0.4f, 0.41f, -0.72f, 0.8f, -0.81f)
                curveToRelative(3.01f, -0.67f, 5.8f, -1.01f, 8.2f, -1.01f)
                curveToRelative(0.49f, 0f, 1.0f, 0.02f, 1.53f, 0.05f)
                curveToRelative(-0.13f, 4.39f, 0.35f, 6.69f, 0.38f, 6.78f)
                curveToRelative(0.09f, 0.4f, 0.4f, 0.7f, 0.8f, 0.77f)
                curveToRelative(0.09f, 0.02f, 1.51f, 0.28f, 3.43f, 0.42f)
                curveToRelative(-0.34f, -0.01f, -0.71f, -0.02f, -1.14f, -0.02f)
                curveToRelative(-5.23f, 0f, -8f, 2.77f, -8f, 8f)
                close()
            }
        }.also { _FileCircleInfo = it}
