package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentSigned: ImageVector? = null

val Icons.Ss.DocumentSigned: ImageVector
    get() = _DocumentSigned ?: UXIcon(name = "DocumentSigned") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-17f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(13.13f, 21f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, -0.71f)
                curveToRelative(-0.31f, -0.22f, -0.42f, -0.29f, -0.66f, -0.29f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, 0.71f)
                lineToRelative(-1.41f, -1.42f)
                arcToRelative(4.76f, 4.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.19f, -1.29f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, 0.66f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, 0.34f)
                curveToRelative(0.72f, 0f, 1.69f, -1.05f, 2.04f, -1.57f)
                lineToRelative(1.65f, 1.13f)
                curveToRelative(-0.17f, 0.25f, -1.72f, 2.44f, -3.69f, 2.44f)
                close()
                moveTo(16f, 0.22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 0.95f)
                lineToRelative(2.24f, 2.24f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, 1.59f)
                horizontalLineToRelative(-4.79f)
                close()
            }
        }.also { _DocumentSigned = it}
