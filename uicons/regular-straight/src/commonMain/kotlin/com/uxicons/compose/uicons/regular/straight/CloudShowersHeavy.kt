package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowersHeavy: ImageVector? = null

val Icons.Rs.CloudShowersHeavy: ImageVector
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
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 2.05f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.59f, 9.7f)
                lineToRelative(0.78f, -1.86f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -6.51f)
                lineToRelative(0.8f, -0.41f)
                lineToRelative(-0.32f, -0.84f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 4.29f)
                lineToRelative(0.21f, 0.69f)
                lineTo(16.68f, 7f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.61f, 9.48f)
                lineToRelative(-1.29f, 3.09f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.44f, 5.06f)
                close()
            }
        }.also { _CloudShowersHeavy = it}
