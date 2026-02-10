package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Bs.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 24f)
                curveTo(7.01f, 24f, 5f, 21.81f, 5f, 20f)
                lineTo(8f, 20f)
                lineToRelative(0f, -0.04f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 21f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                lineTo(0f, 18f)
                lineTo(0f, 15f)
                lineTo(9.5f, 15f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19.5f)
                close()
                moveTo(19.5f, 11f)
                lineTo(13.7f, 11f)
                arcToRelative(8.55f, 8.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.21f, 3f)
                lineTo(19.5f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.96f)
                lineTo(18f, 16f)
                lineTo(15f, 16f)
                curveToRelative(0f, 1.81f, 2.01f, 4f, 4.5f, 4f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9f)
                close()
                moveTo(0f, 6.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 13f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.5f)
                close()
                moveTo(5f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 2f)
                lineTo(5f, 2f)
                close()
                moveTo(5f, 11f)
                lineTo(8f, 11f)
                lineTo(8f, 9f)
                lineTo(5f, 9f)
                close()
                moveTo(19.5f, 9f)
                arcToRelative(1.52f, 1.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, -0.03f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 0f)
                curveTo(17.01f, 0f, 15f, 2.19f, 15f, 4f)
                lineToRelative(3f, 0.04f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                lineTo(14.97f, 6f)
                curveToRelative(0.01f, 0.17f, 0.03f, 0.33f, 0.03f, 0.5f)
                arcTo(8.47f, 8.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.62f, 9f)
                close()
            }
        }.also { _WindWarning = it}
