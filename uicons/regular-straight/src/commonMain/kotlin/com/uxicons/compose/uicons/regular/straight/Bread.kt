package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bread: ImageVector? = null

val Icons.Rs.Bread: ImageVector
    get() = _Bread ?: UXIcon(name = "Bread") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.03f, 24f)
                arcToRelative(6.0f, 6.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.39f, -1.64f)
                curveTo(-0.04f, 20.68f, -0.44f, 18.0f, 0.49f, 14.82f)
                arcTo(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.03f, 6.03f)
                arcTo(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.82f, 0.49f)
                curveTo(18f, -0.45f, 20.68f, -0.04f, 22.36f, 1.64f)
                horizontalLineToRelative(0f)
                curveTo(24.04f, 3.32f, 24.44f, 6f, 23.51f, 9.18f)
                arcToRelative(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.54f, 8.79f)
                arcToRelative(21.55f, 21.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.79f, 5.54f)
                arcTo(11.21f, 11.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.03f, 24f)
                close()
                moveTo(17.97f, 2f)
                arcToRelative(9.26f, 9.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.58f, 0.41f)
                arcTo(19.54f, 19.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.44f, 7.44f)
                arcToRelative(19.54f, 19.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.03f, 7.94f)
                curveToRelative(-0.72f, 2.45f, -0.49f, 4.43f, 0.64f, 5.56f)
                reflectiveCurveToRelative(3.11f, 1.36f, 5.56f, 0.64f)
                arcToRelative(19.54f, 19.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.94f, -5.03f)
                arcToRelative(19.54f, 19.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.03f, -7.94f)
                curveToRelative(0.72f, -2.45f, 0.49f, -4.43f, -0.64f, -5.56f)
                horizontalLineToRelative(0f)
                arcTo(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.97f, 2f)
                close()
                moveTo(9f, 9f)
                verticalLineToRelative(2f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineToRelative(2f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                close()
                moveTo(13f, 5f)
                lineTo(13f, 7f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineToRelative(2f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(2f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineToRelative(2f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                close()
            }
        }.also { _Bread = it}
