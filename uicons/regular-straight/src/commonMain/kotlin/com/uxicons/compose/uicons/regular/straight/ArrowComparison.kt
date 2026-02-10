package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowComparison: ImageVector? = null

val Icons.Rs.ArrowComparison: ImageVector
    get() = _ArrowComparison ?: UXIcon(name = "ArrowComparison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.55f, 10.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-8.96f, 8.96f)
                lineToRelative(-5f, -5f)
                lineToRelative(-6.59f, 6.59f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(2f)
                lineTo(2f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.59f)
                lineToRelative(8f, -8f)
                lineToRelative(5f, 5f)
                lineToRelative(7.55f, -7.55f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-6.59f, 6.59f)
                lineToRelative(-5f, -5f)
                lineTo(0.07f, 12.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.51f, -7.51f)
                lineToRelative(5f, 5f)
                lineTo(22f, 3.41f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ArrowComparison = it}
