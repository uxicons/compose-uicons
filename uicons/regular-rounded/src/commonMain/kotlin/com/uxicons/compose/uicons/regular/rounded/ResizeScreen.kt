package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResizeScreen: ImageVector? = null

val Icons.Rr.ResizeScreen: ImageVector
    get() = _ResizeScreen ?: UXIcon(name = "ResizeScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.22f, 0.44f, -2.4f, 1.25f, -3.31f)
                curveToRelative(0.36f, -0.41f, 1.0f, -0.45f, 1.41f, -0.09f)
                curveToRelative(0.41f, 0.37f, 0.45f, 1.0f, 0.09f, 1.41f)
                curveToRelative(-0.48f, 0.55f, -0.75f, 1.25f, -0.75f, 1.98f)
                verticalLineToRelative(8.0f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.73f, -0.27f, -1.44f, -0.75f, -1.98f)
                curveToRelative(-0.37f, -0.41f, -0.33f, -1.05f, 0.09f, -1.41f)
                curveToRelative(0.41f, -0.37f, 1.05f, -0.33f, 1.41f, 0.09f)
                curveToRelative(0.81f, 0.91f, 1.25f, 2.09f, 1.25f, 3.31f)
                close()
                moveTo(5f, 11f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(7f, 11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(9.45f, 7.25f)
                lineTo(10.14f, 6.56f)
                lineTo(12.44f, 8.86f)
                lineTo(11.75f, 9.55f)
                curveToRelative(-0.54f, 0.54f, -0.16f, 1.45f, 0.6f, 1.45f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.48f, 0f, 0.88f, -0.39f, 0.88f, -0.88f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.76f, -0.91f, -1.14f, -1.45f, -0.6f)
                lineToRelative(-0.69f, 0.69f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(0.69f, -0.69f)
                curveToRelative(0.54f, -0.54f, 0.16f, -1.45f, -0.6f, -1.45f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-0.48f, 0f, -0.88f, 0.39f, -0.88f, 0.88f)
                verticalLineToRelative(2.77f)
                curveToRelative(0f, 0.76f, 0.91f, 1.14f, 1.45f, 0.6f)
                close()
            }
        }.also { _ResizeScreen = it}
