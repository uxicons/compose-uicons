package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Rs.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.49f, 7.5f)
                lineTo(0f, 1.36f)
                lineTo(1.49f, 0.03f)
                lineToRelative(5.49f, 6.15f)
                curveToRelative(0.66f, 0.73f, 1.02f, 1.68f, 1.02f, 2.67f)
                verticalLineToRelative(7.17f)
                lineToRelative(1.5f, -1.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.51f, 2.51f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-2.51f, -2.51f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(-7.16f)
                curveToRelative(0f, -0.49f, -0.18f, -0.97f, -0.51f, -1.33f)
                close()
                moveTo(17f, 19.0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(2.51f, -2.51f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.5f, 1.51f)
                verticalLineToRelative(-7.17f)
                curveToRelative(0f, -0.49f, 0.18f, -0.97f, 0.51f, -1.33f)
                lineToRelative(5.49f, -6.15f)
                lineTo(22.51f, 0.03f)
                lineToRelative(-5.49f, 6.15f)
                curveToRelative(-0.66f, 0.73f, -1.02f, 1.68f, -1.02f, 2.67f)
                verticalLineToRelative(7.16f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.51f, 2.51f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                close()
                moveTo(22f, 21.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 22.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-9f)
                lineTo(0f, 12.0f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _InsertArrows = it}
