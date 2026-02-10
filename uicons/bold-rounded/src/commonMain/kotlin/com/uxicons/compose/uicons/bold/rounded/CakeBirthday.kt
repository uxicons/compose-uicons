package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Br.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(22f)
            verticalLineTo(14.32f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.68f, 9f)
            horizontalLineTo(13.5f)
            verticalLineTo(6.33f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3.75f)
            arcTo(5.72f, 5.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.55f, 0.69f)
            arcToRelative(2.17f, 2.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.11f, 0f)
            arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3.75f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 2.58f)
            verticalLineTo(9f)
            horizontalLineTo(7.32f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14.32f)
            verticalLineTo(21f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(5f, 16.74f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.88f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.38f, 17f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14.86f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.62f, 17f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, -2.14f)
            arcTo(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16.74f)
            verticalLineTo(21f)
            horizontalLineTo(5f)
            close()
        }
    }.also { _CakeBirthday = it }
