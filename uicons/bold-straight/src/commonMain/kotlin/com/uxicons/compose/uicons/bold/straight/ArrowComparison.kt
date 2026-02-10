package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowComparison: ImageVector? = null

val Icons.Bs.ArrowComparison: ImageVector
    get() = _ArrowComparison ?: UXIcon(name = "ArrowComparison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.84f, 10.04f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-8.96f, 8.96f)
                lineToRelative(-5f, -5f)
                lineToRelative(-5.44f, 5.44f)
                lineToRelative(2.44f, 2.44f)
                lineTo(1.09f, 24.0f)
                curveToRelative(-0.6f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
                verticalLineToRelative(-5.91f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(7.56f, -7.56f)
                lineToRelative(5f, 5f)
                lineToRelative(6.84f, -6.84f)
                close()
                moveTo(22.91f, 0f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-5.44f, 5.44f)
                lineToRelative(-5f, -5f)
                lineTo(0.06f, 11.82f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(6.82f, -6.82f)
                lineToRelative(5f, 5f)
                lineToRelative(7.56f, -7.56f)
                lineToRelative(2.44f, 2.44f)
                lineTo(24f, 1.09f)
                curveToRelative(0f, -0.6f, -0.49f, -1.09f, -1.09f, -1.09f)
                close()
            }
        }.also { _ArrowComparison = it}
