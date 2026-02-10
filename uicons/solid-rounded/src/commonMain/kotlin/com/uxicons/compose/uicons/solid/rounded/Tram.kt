package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tram: ImageVector? = null

val Icons.Sr.Tram: ImageVector
    get() = _Tram ?: UXIcon(name = "Tram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 2f)
                close()
                moveTo(10f, 5f)
                lineTo(10f, 9f)
                lineTo(9f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                lineTo(15f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 3f)
                curveToRelative(0f, -0.02f, 0f, -0.04f, 0f, -0.05f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 5f)
                close()
                moveTo(19f, 9f)
                lineTo(17f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                lineTo(24f, 14f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
                moveTo(7f, 9f)
                lineTo(5f, 9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(2f)
                lineTo(7f, 16f)
                close()
                moveTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 18f)
                lineTo(0f, 18f)
                close()
                moveTo(20f, 2.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, -0.02f)
                lineToRelative(3f, -0.55f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.82f, 0.02f)
                lineToRelative(-3f, 0.55f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2.54f)
                close()
                moveTo(1f, 6f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, -0.02f)
                lineToRelative(4f, -0.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, -1.97f)
                lineToRelative(-4f, 0.73f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                close()
            }
        }.also { _Tram = it}
