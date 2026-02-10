package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPaper: ImageVector? = null

val Icons.Sr.HandPaper: ImageVector
    get() = _HandPaper ?: UXIcon(name = "HandPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(12.65f)
                lineToRelative(-2.6f, -2.65f)
                curveToRelative(-0.09f, -0.09f, -0.24f, -0.2f, -0.44f, -0.33f)
                curveToRelative(-0.84f, -0.47f, -1.95f, -0.28f, -2.58f, 0.56f)
                curveToRelative(-0.6f, 0.81f, -0.44f, 1.97f, 0.28f, 2.68f)
                lineToRelative(3.52f, 3.63f)
                curveToRelative(2.45f, 2.53f, 5.82f, 3.95f, 9.34f, 3.95f)
                horizontalLineToRelative(2.5f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HandPaper = it}
