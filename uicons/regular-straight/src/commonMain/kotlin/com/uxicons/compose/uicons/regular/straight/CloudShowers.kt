package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowers: ImageVector? = null

val Icons.Rs.CloudShowers: ImageVector
    get() = _CloudShowers ?: UXIcon(name = "CloudShowers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                lineTo(13f, 24f)
                lineTo(13f, 17f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 17f)
                lineTo(5f, 17f)
                verticalLineToRelative(7f)
                lineTo(7f, 24f)
                close()
                moveTo(19f, 15f)
                lineTo(17f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17.44f, 5.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 10.05f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19.4f)
                lineTo(3f, 16.95f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, -5.57f)
                lineToRelative(0.8f, -0.41f)
                lineToRelative(-0.32f, -0.84f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 4.29f)
                lineToRelative(0.21f, 0.69f)
                lineTo(16.68f, 7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15.66f)
                lineTo(21f, 18.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.44f, 5.06f)
                close()
            }
        }.also { _CloudShowers = it}
