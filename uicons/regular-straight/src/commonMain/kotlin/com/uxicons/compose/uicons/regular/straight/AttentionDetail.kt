package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttentionDetail: ImageVector? = null

val Icons.Rs.AttentionDetail: ImageVector
    get() = _AttentionDetail ?: UXIcon(name = "AttentionDetail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.89f, 19.47f)
                curveToRelative(0.7f, -0.98f, 1.11f, -2.18f, 1.11f, -3.47f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.29f, 0f, 2.49f, -0.42f, 3.47f, -1.11f)
                lineToRelative(2.67f, 2.67f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.67f, -2.67f)
                close()
                moveTo(16f, 19f)
                curveToRelative(-2.77f, 0f, -4.12f, -2.23f, -4.5f, -3f)
                curveToRelative(0.39f, -0.78f, 1.73f, -3f, 4.5f, -3f)
                reflectiveCurveToRelative(4.12f, 2.22f, 4.5f, 3f)
                curveToRelative(-0.39f, 0.78f, -1.73f, 3f, -4.5f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-0.27f)
                curveToRelative(-1.23f, -0.32f, -2.35f, -0.91f, -3.28f, -1.73f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.41f)
                lineTo(12.41f, 0f)
                close()
                moveTo(13f, 7f)
                verticalLineToRelative(-3.59f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _AttentionDetail = it}
