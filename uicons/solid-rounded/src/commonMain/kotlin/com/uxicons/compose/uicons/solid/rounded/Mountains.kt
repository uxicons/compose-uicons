package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Sr.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(21.45f, 24f)
                lineTo(12.59f, 24f)
                arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.22f, -1.26f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, -2.47f)
                lineToRelative(4.44f, -7.96f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 0f)
                lineTo(23.7f, 20.26f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 2.48f)
                arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.45f, 24f)
                close()
                moveTo(8.64f, 23.75f)
                arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.59f, 19.3f)
                lineToRelative(4.44f, -7.96f)
                arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.51f, -1.6f)
                lineTo(12.94f, 6.75f)
                arcToRelative(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.88f, 0f)
                lineTo(0.41f, 19.05f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 24f)
                lineTo(8.8f, 24f)
                curveTo(8.74f, 23.92f, 8.69f, 23.84f, 8.64f, 23.75f)
                close()
            }
        }.also { _Mountains = it}
