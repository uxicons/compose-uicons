package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleWrong: ImageVector? = null

val Icons.Rs.DocumentCircleWrong: ImageVector
    get() = _DocumentCircleWrong ?: UXIcon(name = "DocumentCircleWrong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.52f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.41f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(11.35f)
                curveToRelative(-0.71f, -0.57f, -1.32f, -1.24f, -1.83f, -2f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(19.96f, 15.46f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _DocumentCircleWrong = it}
