package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestore: ImageVector? = null

val Icons.Rr.TrashRestore: ImageVector
    get() = _TrashRestore ?: UXIcon(name = "TrashRestore") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.11f, 4f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                lineTo(2.11f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.86f)
                lineToRelative(1.3f, 13.48f)
                curveToRelative(0.25f, 2.58f, 2.39f, 4.52f, 4.98f, 4.52f)
                horizontalLineToRelative(5.73f)
                curveToRelative(2.59f, 0f, 4.73f, -1.95f, 4.98f, -4.53f)
                lineToRelative(1.28f, -13.47f)
                horizontalLineToRelative(0.89f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11.11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                close()
                moveTo(17.96f, 19.28f)
                curveToRelative(-0.15f, 1.55f, -1.43f, 2.72f, -2.99f, 2.72f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(-1.55f, 0f, -2.84f, -1.17f, -2.99f, -2.71f)
                lineToRelative(-1.28f, -13.29f)
                horizontalLineToRelative(14.24f)
                lineToRelative(-1.26f, 13.28f)
                close()
                moveTo(15.71f, 12.48f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.4f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(1.16f, -1.16f, 3.04f, -1.15f, 4.19f, 0f)
                lineToRelative(1.61f, 1.61f)
                close()
            }
        }.also { _TrashRestore = it}
