package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPaper: ImageVector? = null

val Icons.Bs.HandPaper: ImageVector
    get() = _HandPaper ?: UXIcon(name = "HandPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(11.9f)
                curveToRelative(0f, 3.09f, -2.51f, 5.6f, -5.6f, 5.6f)
                horizontalLineToRelative(-1.33f)
                curveToRelative(-1.8f, 0f, -3.55f, -0.48f, -5.09f, -1.36f)
                verticalLineTo(3.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.74f, 0.57f, -1.74f, 1.48f)
                verticalLineToRelative(12.27f)
                lineToRelative(-2.64f, -2.3f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(4.36f, 3.91f)
                curveToRelative(2.45f, 2.24f, 5.64f, 3.48f, 8.96f, 3.48f)
                horizontalLineToRelative(1.33f)
                curveToRelative(4.74f, 0f, 8.6f, -3.86f, 8.6f, -8.6f)
                verticalLineTo(3.5f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.99f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.99f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(1.5f)
                close()
            }
        }.also { _HandPaper = it}
