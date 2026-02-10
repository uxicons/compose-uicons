package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Tr.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-3.85f, -3.85f)
                lineToRelative(0.03f, -14.29f)
                horizontalLineToRelative(1.38f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.31f, 0f, -4.22f, 1.75f, -4.47f, 4f)
                horizontalLineToRelative(-1.73f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(10.9f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(7.44f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(19.02f, 5f)
                lineToRelative(-0.02f, 13.29f)
                lineTo(5.71f, 5f)
                horizontalLineToRelative(13.32f)
                close()
                moveTo(18.38f, 22.19f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.05f, 0.71f)
                curveToRelative(-0.82f, 0.71f, -1.86f, 1.1f, -2.95f, 1.1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineToRelative(0.03f, -11.0f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineToRelative(-0.03f, 11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.84f, 0f, 1.66f, -0.3f, 2.29f, -0.86f)
                curveToRelative(0.21f, -0.18f, 0.53f, -0.16f, 0.7f, 0.05f)
                close()
            }
        }.also { _TrashCanSlash = it}
