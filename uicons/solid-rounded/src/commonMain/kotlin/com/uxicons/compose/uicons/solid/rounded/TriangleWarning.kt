package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Sr.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.08f, 15.33f)
                lineTo(15f, 2.57f)
                curveToRelative(-0.68f, -0.98f, -1.81f, -1.57f, -3f, -1.57f)
                reflectiveCurveToRelative(-2.32f, 0.58f, -3.03f, 1.6f)
                lineTo(0.93f, 15.31f)
                curveToRelative(-1.02f, 1.46f, -1.21f, 3.21f, -0.5f, 4.56f)
                curveToRelative(0.7f, 1.35f, 2.17f, 2.12f, 4.01f, 2.12f)
                horizontalLineToRelative(15.12f)
                curveToRelative(1.85f, 0f, 3.31f, -0.77f, 4.01f, -2.12f)
                curveToRelative(0.7f, -1.35f, 0.51f, -3.09f, -0.49f, -4.54f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 7f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _TriangleWarning = it}
