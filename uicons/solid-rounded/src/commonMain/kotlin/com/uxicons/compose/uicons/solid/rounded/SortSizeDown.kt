package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeDown: ImageVector? = null

val Icons.Sr.SortSizeDown: ImageVector
    get() = _SortSizeDown ?: UXIcon(name = "SortSizeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(14f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.31f, 18.28f)
                lineToRelative(-3.31f, 3.15f)
                lineTo(7f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(5f, 21.43f)
                lineToRelative(-3.31f, -3.15f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.03f, 1.41f)
                lineToRelative(3.57f, 3.4f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.1f, -0.86f)
                lineToRelative(3.59f, -3.41f)
                curveToRelative(0.4f, -0.38f, 0.42f, -1.01f, 0.03f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.03f)
                close()
            }
        }.also { _SortSizeDown = it}
