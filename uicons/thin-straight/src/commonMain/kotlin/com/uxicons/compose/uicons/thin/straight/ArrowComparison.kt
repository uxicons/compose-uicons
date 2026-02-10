package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowComparison: ImageVector? = null

val Icons.Ts.ArrowComparison: ImageVector
    get() = _ArrowComparison ?: UXIcon(name = "ArrowComparison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.15f, 10.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-8.85f, 8.85f)
                lineToRelative(-5f, -5f)
                lineTo(1.71f, 23f)
                horizontalLineToRelative(5.29f)
                verticalLineToRelative(1f)
                lineTo(1.5f, 24f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.29f)
                lineToRelative(9f, -9f)
                lineToRelative(5f, 5f)
                lineToRelative(8.15f, -8.15f)
                close()
                moveTo(22.5f, 0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.29f)
                lineToRelative(-8.29f, 8.29f)
                lineToRelative(-5f, -5f)
                lineTo(0.15f, 13.15f)
                lineToRelative(0.71f, 0.71f)
                lineTo(9f, 5.71f)
                lineToRelative(5f, 5f)
                lineTo(23f, 1.71f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowComparison = it}
