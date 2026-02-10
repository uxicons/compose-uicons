package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Sr.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.1f, 6f)
                curveToRelative(0.4f, -1.96f, 1.94f, -3.5f, 3.9f, -3.9f)
                verticalLineToRelative(3.9f)
                lineTo(0.1f, 6f)
                close()
                moveTo(4f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                lineTo(4f, 8f)
                close()
                moveTo(6f, 6f)
                lineTo(23.9f, 6f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(6f, 2f)
                lineTo(6f, 6f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(6f, 22f)
                lineTo(6f, 8f)
                lineTo(24f, 8f)
                close()
                moveTo(21.71f, 11.75f)
                lineToRelative(-1.07f, -1.08f)
                curveToRelative(-0.87f, -0.87f, -2.39f, -0.87f, -3.26f, 0f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.29f, -0.29f)
                verticalLineToRelative(2.13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(0.29f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.07f, 1.08f)
                curveToRelative(-0.44f, 0.43f, -0.68f, 1.01f, -0.68f, 1.63f)
                reflectiveCurveToRelative(0.24f, 1.2f, 0.68f, 1.63f)
                lineToRelative(1.08f, 1.08f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.29f, -0.29f)
                horizontalLineToRelative(2.13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2.13f)
                lineToRelative(0.29f, 0.29f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _TablePivot = it}
