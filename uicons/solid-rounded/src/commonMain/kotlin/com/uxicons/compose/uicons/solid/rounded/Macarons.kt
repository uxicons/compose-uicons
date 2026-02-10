package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Macarons: ImageVector? = null

val Icons.Sr.Macarons: ImageVector
    get() = _Macarons ?: UXIcon(name = "Macarons") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.28f, 8f)
                horizontalLineToRelative(15.45f)
                curveToRelative(-0.62f, 1.74f, -2.27f, 3f, -4.22f, 3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.95f, 0f, -3.6f, -1.26f, -4.22f, -3f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.31f, 0f, -4.2f, 1.76f, -4.45f, 4f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.31f, 0f, -4.2f, 1.76f, -4.45f, 4f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.5f, 24f)
                horizontalLineToRelative(7f)
                curveToRelative(1.95f, 0f, 3.6f, -1.26f, 4.22f, -3f)
                horizontalLineToRelative(-15.45f)
                curveToRelative(0.62f, 1.74f, 2.27f, 3f, 4.22f, 3f)
                close()
            }
        }.also { _Macarons = it}
