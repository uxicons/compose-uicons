package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeBirthday: ImageVector? = null

val Icons.Ss.CakeBirthday: ImageVector
    get() = _CakeBirthday ?: UXIcon(name = "CakeBirthday") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 13f)
                lineTo(2f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 9f)
                horizontalLineToRelative(6f)
                lineTo(11f, 6.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                curveTo(9f, 2.53f, 10.81f, 0.95f, 11.37f, 0.49f)
                lineTo(12f, -0.02f)
                lineToRelative(0.63f, 0.51f)
                curveTo(13.19f, 0.95f, 15f, 2.53f, 15f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.82f)
                lineTo(13f, 9f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveToRelative(-1.09f, 0f, -1.75f, -0.69f, -1.75f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveTo(13.66f, 14f, 13f, 13.31f, 13f, 13f)
                lineTo(11f, 13f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveToRelative(-1.09f, 0f, -1.75f, -0.69f, -1.75f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.34f, -0.68f, 1f, -1.75f, 1f)
                curveTo(2.66f, 14f, 2f, 13.31f, 2f, 13f)
                close()
                moveTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                lineTo(24f, 22f)
                close()
                moveTo(22f, 15.62f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.25f, 16f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, -1f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0.01f)
                arcTo(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 15f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, 1f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15.62f)
                lineTo(2f, 20f)
                lineTo(22f, 20f)
                close()
            }
        }.also { _CakeBirthday = it}
