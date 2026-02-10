package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleCamera: ImageVector? = null

val Icons.Sr.CircleCamera: ImageVector
    get() = _CircleCamera ?: UXIcon(name = "CircleCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 9f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(18f, 14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.64f, 1.32f, -2.97f, 2.95f, -3.0f)
                lineToRelative(0.7f, -1.08f)
                curveToRelative(0.37f, -0.57f, 1.0f, -0.92f, 1.68f, -0.92f)
                horizontalLineToRelative(1.34f)
                curveToRelative(0.69f, 0f, 1.31f, 0.34f, 1.68f, 0.92f)
                lineToRelative(0.69f, 1.08f)
                curveToRelative(1.63f, 0.03f, 2.95f, 1.36f, 2.95f, 3.0f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _CircleCamera = it}
