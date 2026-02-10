package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteYea: ImageVector? = null

val Icons.Sr.VoteYea: ImageVector
    get() = _VoteYea ?: UXIcon(name = "VoteYea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(19f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(15.71f, 9.56f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-1.17f, -1.17f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.19f, 0.71f, 0f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.86f, 1.28f, -3.41f, 3f, -3.86f)
                verticalLineToRelative(3.86f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3.86f)
                curveToRelative(1.72f, 0.45f, 3f, 2f, 3f, 3.86f)
                close()
            }
        }.also { _VoteYea = it}
