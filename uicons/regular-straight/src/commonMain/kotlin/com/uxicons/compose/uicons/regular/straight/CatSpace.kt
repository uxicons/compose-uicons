package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatSpace: ImageVector? = null

val Icons.Rs.CatSpace: ImageVector
    get() = _CatSpace ?: UXIcon(name = "CatSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 4.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(6.56f, 24f)
                curveToRelative(-3.22f, 0f, -6.56f, -2.06f, -6.56f, -5.5f)
                curveToRelative(0f, -2.13f, 0.94f, -3.66f, 1.78f, -5.0f)
                curveToRelative(0.66f, -1.06f, 1.22f, -1.97f, 1.22f, -3.0f)
                curveToRelative(0f, -1.3f, -0.36f, -2.5f, -3f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(4.35f, 0f, 5f, 2.82f, 5f, 4.5f)
                curveToRelative(0f, 1.6f, -0.77f, 2.84f, -1.52f, 4.05f)
                curveToRelative(-0.76f, 1.23f, -1.48f, 2.38f, -1.48f, 3.95f)
                curveToRelative(0f, 1.79f, 1.47f, 2.85f, 3.0f, 3.28f)
                curveToRelative(0.01f, -1.26f, 0.34f, -7.63f, 6.23f, -10.82f)
                curveToRelative(-0.77f, -1.13f, -1.23f, -2.49f, -1.23f, -3.95f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.9f, -0.76f, 3.63f, -2f, 4.89f)
                verticalLineToRelative(10.11f)
                close()
                moveTo(13f, 7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(21f, 3f)
                lineToRelative(-2.03f, 1.52f)
                curveToRelative(-0.58f, -0.33f, -1.25f, -0.52f, -1.97f, -0.52f)
                reflectiveCurveToRelative(-1.39f, 0.19f, -1.97f, 0.52f)
                lineToRelative(-2.03f, -1.52f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.68f)
                curveToRelative(-0.91f, 0.43f, -1.93f, 0.68f, -3f, 0.68f)
                curveToRelative(-1.65f, 0f, -3.16f, -0.57f, -4.36f, -1.52f)
                curveToRelative(-5.89f, 2.82f, -5.66f, 9.19f, -5.64f, 9.48f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
            }
        }.also { _CatSpace = it}
