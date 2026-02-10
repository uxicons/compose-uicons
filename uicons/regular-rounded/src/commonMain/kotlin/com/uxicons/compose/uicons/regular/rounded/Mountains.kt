package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Rr.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(20f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
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
                moveTo(17.02f, 13f)
                arcToRelative(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.28f)
                lineToRelative(-4.44f, 7.96f)
                arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 0.48f)
                arcToRelative(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.27f)
                horizontalLineToRelative(8.86f)
                arcToRelative(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.28f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.49f)
                lineToRelative(-4.43f, -7.95f)
                horizontalLineToRelative(0f)
                arcTo(0.56f, 0.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.02f, 13f)
                close()
                moveTo(8f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(3.35f, 22f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.18f, -1.99f)
                lineToRelative(6.65f, -12.3f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7f)
                horizontalLineToRelative(0f)
                arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, 0.71f)
                lineTo(12.41f, 9.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.76f, -0.95f)
                lineTo(12.94f, 6.75f)
                arcToRelative(3.34f, 3.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.88f, 0f)
                lineTo(0.41f, 19.05f)
                arcTo(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 24f)
                lineTo(7f, 24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 23f)
                close()
            }
        }.also { _Mountains = it}
