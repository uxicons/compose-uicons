package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowersHeavy: ImageVector? = null

val Icons.Ss.CloudShowersHeavy: ImageVector
    get() = _CloudShowersHeavy ?: UXIcon(name = "CloudShowersHeavy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 24f)
                lineToRelative(-1.85f, -0.77f)
                lineToRelative(3f, -7.17f)
                lineToRelative(1.85f, 0.77f)
                close()
                moveTo(13.71f, 16.83f)
                lineTo(11.86f, 16.06f)
                lineTo(8.86f, 23.23f)
                lineTo(10.71f, 24f)
                close()
                moveTo(9.42f, 16.83f)
                lineTo(7.57f, 16.06f)
                lineTo(4.57f, 23.23f)
                lineTo(6.42f, 24f)
                close()
                moveTo(17.44f, 5.06f)
                curveTo(13.55f, -4.07f, 0.02f, 0.22f, 2.27f, 10.05f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.59f, 9.7f)
                lineToRelative(1.67f, -3.92f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.29f, 14f)
                horizontalLineToRelative(9.97f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, 2.74f)
                lineToRelative(-1.13f, 2.83f)
                curveTo(26.35f, 16.99f, 25.25f, 6.02f, 17.44f, 5.06f)
                close()
            }
        }.also { _CloudShowersHeavy = it}
