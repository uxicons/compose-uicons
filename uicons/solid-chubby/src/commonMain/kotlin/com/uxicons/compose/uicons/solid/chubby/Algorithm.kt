package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Algorithm: ImageVector? = null

val Icons.Sc.Algorithm: ImageVector
    get() = _Algorithm ?: UXIcon(name = "Algorithm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.8f, 18.4f)
                curveToRelative(0.27f, 0.35f, 0.27f, 0.84f, 0f, 1.2f)
                curveToRelative(-0.91f, 1.21f, -1.99f, 2.29f, -3.2f, 3.2f)
                curveToRelative(-0.3f, 0.23f, -0.71f, 0.26f, -1.05f, 0.1f)
                curveToRelative(-0.34f, -0.17f, -0.55f, -0.52f, -0.55f, -0.9f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-11.28f)
                curveToRelative(-0.42f, 0.99f, -1.32f, 1.5f, -2.72f, 1.5f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                curveToRelative(0f, -1.4f, 0.51f, -2.3f, 1.5f, -2.72f)
                verticalLineToRelative(-9.55f)
                curveToRelative(-0.99f, -0.42f, -1.5f, -1.32f, -1.5f, -2.72f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                curveToRelative(1.4f, 0f, 2.31f, 0.51f, 2.72f, 1.5f)
                horizontalLineToRelative(10.55f)
                curveToRelative(0.42f, -0.99f, 1.32f, -1.5f, 2.72f, -1.5f)
                curveToRelative(1.99f, 0f, 3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                curveToRelative(-1.4f, 0f, -2.3f, -0.51f, -2.72f, -1.5f)
                horizontalLineToRelative(-10.55f)
                curveToRelative(-0.24f, 0.57f, -0.65f, 0.98f, -1.22f, 1.22f)
                verticalLineToRelative(9.55f)
                curveToRelative(0.57f, 0.24f, 0.98f, 0.65f, 1.22f, 1.22f)
                horizontalLineToRelative(11.28f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.38f, 0.21f, -0.72f, 0.55f, -0.9f)
                curveToRelative(0.34f, -0.17f, 0.74f, -0.13f, 1.05f, 0.1f)
                curveToRelative(1.21f, 0.91f, 2.29f, 1.99f, 3.2f, 3.2f)
                close()
                moveTo(9f, 11.5f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                reflectiveCurveToRelative(-1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                close()
            }
        }.also { _Algorithm = it}
