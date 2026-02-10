package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Sr.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 8.26f)
                lineToRelative(14.21f, 14.28f)
                reflectiveCurveToRelative(-0.36f, 0.48f, -0.97f, 0.89f)
                curveToRelative(-0.67f, 0.45f, -1.52f, 0.58f, -2.33f, 0.58f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-10.74f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.71f, 3.71f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(3.1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12.49f)
                lineToRelative(3.8f, 3.8f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(15.72f, 4f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(7.63f)
                close()
            }
        }.also { _TrashCanSlash = it}
