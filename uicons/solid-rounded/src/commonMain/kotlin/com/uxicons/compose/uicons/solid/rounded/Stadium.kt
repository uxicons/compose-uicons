package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stadium: ImageVector? = null

val Icons.Sr.Stadium: ImageVector
    get() = _Stadium ?: UXIcon(name = "Stadium") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.52f, 7f)
                horizontalLineToRelative(2.48f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.66f, 0f, 1.31f, 0.15f, 1.9f, 0.44f)
                lineToRelative(1.73f, 0.86f)
                curveToRelative(0.5f, 0.33f, 0.5f, 1.06f, 0f, 1.4f)
                lineToRelative(-2.63f, 1.3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-1.09f, 7f)
                horizontalLineToRelative(-4.77f)
                lineToRelative(-1.1f, -7f)
                close()
                moveTo(16.4f, 14f)
                horizontalLineToRelative(6.48f)
                lineToRelative(0.95f, -2.85f)
                curveToRelative(0.11f, -0.32f, 0.16f, -0.66f, 0.16f, -1.0f)
                curveToRelative(0f, -1.69f, -1.33f, -3.06f, -3f, -3.14f)
                verticalLineToRelative(-3.02f)
                lineToRelative(2.63f, -1.3f)
                curveToRelative(0.5f, -0.33f, 0.5f, -1.06f, 0f, -1.4f)
                lineToRelative(-1.73f, -0.86f)
                curveToRelative(-0.59f, -0.29f, -1.24f, -0.44f, -1.9f, -0.44f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.1f, 7f)
                close()
                moveTo(1.78f, 16f)
                lineTo(3f, 19.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-0.34f)
                lineToRelative(1.22f, -3.66f)
                close()
                moveTo(1.11f, 14f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-1.11f, -7f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                lineToRelative(2.63f, -1.3f)
                curveToRelative(0.5f, -0.33f, 0.5f, -1.06f, 0f, -1.4f)
                lineToRelative(-1.73f, -0.86f)
                curveToRelative(-0.59f, -0.29f, -1.24f, -0.44f, -1.9f, -0.44f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6.01f)
                curveToRelative(-1.67f, 0.08f, -3f, 1.45f, -3f, 3.14f)
                curveToRelative(0f, 0.34f, 0.05f, 0.67f, 0.16f, 1.0f)
                lineToRelative(0.95f, 2.85f)
                close()
            }
        }.also { _Stadium = it}
