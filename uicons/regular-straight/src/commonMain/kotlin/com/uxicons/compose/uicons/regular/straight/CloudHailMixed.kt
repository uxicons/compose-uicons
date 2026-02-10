package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudHailMixed: ImageVector? = null

val Icons.Rs.CloudHailMixed: ImageVector
    get() = _CloudHailMixed ?: UXIcon(name = "CloudHailMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15f)
                close()
                moveTo(6f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                close()
                moveTo(17.44f, 5.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 10.05f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19.79f)
                verticalLineToRelative(-2.13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -6.28f)
                lineToRelative(0.8f, -0.41f)
                lineToRelative(-0.32f, -0.84f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 4.29f)
                lineToRelative(0.21f, 0.69f)
                lineTo(16.68f, 7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 17.79f)
                verticalLineToRelative(2.06f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.56f, -14.79f)
                close()
                moveTo(9.22f, 14.24f)
                lineToRelative(-1.94f, -0.48f)
                lineToRelative(-1.5f, 6f)
                lineToRelative(1.94f, 0.48f)
                close()
                moveTo(14f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 22f)
                close()
                moveTo(17.22f, 14.24f)
                lineTo(15.28f, 13.76f)
                lineTo(13.78f, 19.76f)
                lineTo(15.72f, 20.24f)
                close()
                moveTo(12.29f, 18.01f)
                lineTo(10.35f, 17.53f)
                lineTo(8.85f, 23.53f)
                lineTo(10.79f, 24.01f)
                close()
            }
        }.also { _CloudHailMixed = it}
