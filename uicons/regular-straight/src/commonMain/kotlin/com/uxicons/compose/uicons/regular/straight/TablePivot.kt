package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Rs.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(6.73f)
                lineToRelative(-2f, -1.98f)
                verticalLineToRelative(-0.76f)
                lineTo(7f, 9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4.74f)
                curveToRelative(0.03f, 0.04f, 0.06f, 0.08f, 0.09f, 0.11f)
                lineToRelative(1.89f, 1.89f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(5f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                lineTo(5f, 9f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(7f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(15f)
                close()
                moveTo(12.29f, 16.29f)
                curveToRelative(-0.38f, 0.39f, -0.38f, 1.02f, 0f, 1.42f)
                lineToRelative(2.71f, 2.79f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(2.46f)
                lineToRelative(-2.76f, -2.71f)
                curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0f)
                lineToRelative(-2.76f, 2.71f)
                horizontalLineToRelative(2.46f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-2.71f, 2.79f)
                close()
            }
        }.also { _TablePivot = it}
