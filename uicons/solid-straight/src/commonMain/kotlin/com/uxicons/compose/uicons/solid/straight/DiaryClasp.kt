package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryClasp: ImageVector? = null

val Icons.Ss.DiaryClasp: ImageVector
    get() = _DiaryClasp ?: UXIcon(name = "DiaryClasp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                lineTo(4f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(19f, 13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _DiaryClasp = it}
