package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotFound: ImageVector? = null

val Icons.Ss.NotFound: ImageVector
    get() = _NotFound ?: UXIcon(name = "NotFound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                close()
                moveTo(7.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                lineTo(0f, 10f)
                close()
                moveTo(6.79f, 13.55f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                close()
                moveTo(14.84f, 20.86f)
                curveToRelative(-1.96f, -1.15f, -3.73f, -1.15f, -5.69f, 0f)
                lineToRelative(-1.01f, -1.73f)
                curveToRelative(2.58f, -1.51f, 5.12f, -1.51f, 7.71f, 0f)
                lineToRelative(-1.01f, 1.73f)
                close()
                moveTo(17.21f, 15.51f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.98f, 0.98f)
                close()
            }
        }.also { _NotFound = it}
