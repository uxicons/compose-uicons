package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Rr.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(1f)
                curveTo(0f, 0.45f, 0.45f, 0f, 1f, 0f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(16.45f)
                curveToRelative(2.58f, -7.14f, 9.9f, -12.45f, 18f, -12.45f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-2.22f, -2.28f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.02f, -1.41f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.38f, 1.41f, 0.02f)
                lineToRelative(3.21f, 3.29f)
                curveToRelative(0.37f, 0.37f, 0.56f, 0.86f, 0.57f, 1.36f)
                curveToRelative(0f, 0.01f, 0.0f, 0.01f, 0.0f, 0.02f)
                curveToRelative(0f, 0.0f, -0.0f, 0.01f, -0.0f, 0.01f)
                curveToRelative(0.0f, 0.52f, -0.19f, 1.04f, -0.58f, 1.43f)
                lineToRelative(-3.25f, 3.25f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.27f, -2.27f)
                horizontalLineToRelative(-1.02f)
                curveToRelative(-8.43f, 0f, -15.94f, 6.4f, -16.89f, 14.31f)
                curveToRelative(0.52f, 0.42f, 1.17f, 0.69f, 1.89f, 0.69f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _GraphCurve = it}
