package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guitar: ImageVector? = null

val Icons.Bs.Guitar: ImageVector
    get() = _Guitar ?: UXIcon(name = "Guitar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.18f, 16.32f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.38f, 0.62f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                lineTo(18f, 3f)
                verticalLineToRelative(0.96f)
                lineTo(15.83f, 6.09f)
                arcToRelative(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.61f, 0.54f)
                arcToRelative(5.72f, 5.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, 1.36f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, 9.93f)
                curveToRelative(-3f, 3f, -2.76f, 8.12f, 0.54f, 11.42f)
                arcToRelative(8.84f, 8.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.21f, 2.64f)
                arcToRelative(7.3f, 7.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, -2.1f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -5.13f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.36f, -0.98f)
                arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.57f, -7.56f)
                lineTo(20.2f, 6f)
                horizontalLineTo(21f)
                lineToRelative(2.38f, -2.38f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(15.25f, 13.66f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, 0.44f)
                arcTo(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcToRelative(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.05f, 3.27f)
                curveToRelative(-1.83f, 1.83f, -5.05f, 1.59f, -7.18f, -0.54f)
                reflectiveCurveToRelative(-2.37f, -5.35f, -0.54f, -7.18f)
                arcToRelative(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, -1.06f)
                curveToRelative(0.09f, 0f, 0.17f, 0f, 0.26f, 0.01f)
                arcTo(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 9.37f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -0.62f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.26f, -0.46f)
                lineTo(12.57f, 9.3f)
                lineToRelative(2.11f, 2.14f)
                lineToRelative(1.03f, -1.02f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.25f, 13.66f)
                close()
            }
        }.also { _Guitar = it}
