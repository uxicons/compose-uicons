package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Sr.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineTo(5f)
                curveToRelative(-0.72f, 0f, -1.37f, -0.26f, -1.89f, -0.69f)
                curveToRelative(0.95f, -7.92f, 8.45f, -14.31f, 16.89f, -14.31f)
                horizontalLineToRelative(1.02f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(3.25f, -3.25f)
                curveToRelative(0.4f, -0.39f, 0.59f, -0.91f, 0.58f, -1.43f)
                curveToRelative(0f, -0.0f, 0.0f, -0.01f, 0.0f, -0.01f)
                curveToRelative(0f, -0.01f, -0.0f, -0.01f, -0.0f, -0.02f)
                curveToRelative(-0.01f, -0.49f, -0.2f, -0.98f, -0.57f, -1.36f)
                lineToRelative(-3.21f, -3.29f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.4f, -1.41f, -0.02f)
                curveToRelative(-0.4f, 0.39f, -0.4f, 1.02f, -0.02f, 1.41f)
                lineToRelative(2.22f, 2.28f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-8.1f, 0f, -15.42f, 5.31f, -18f, 12.45f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 0.45f, 0f, 1f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _GraphCurve = it}
