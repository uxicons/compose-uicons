package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookDead: ImageVector? = null

val Icons.Rs.BookDead: ImageVector
    get() = _BookDead ?: UXIcon(name = "BookDead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.39f)
                reflectiveCurveToRelative(0.06f, -2.26f, 0.06f, -3.56f)
                curveToRelative(0f, -2.45f, -1.99f, -4.44f, -4.44f, -4.44f)
                reflectiveCurveToRelative(-4.44f, 1.99f, -4.44f, 4.44f)
                lineToRelative(-0.06f, 3.56f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(17f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(16f)
                lineTo(5f, 18f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
            }
        }.also { _BookDead = it}
