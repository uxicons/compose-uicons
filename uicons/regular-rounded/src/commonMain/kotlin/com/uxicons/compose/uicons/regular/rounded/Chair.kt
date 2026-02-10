package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Rr.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13.26f)
                lineTo(19f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                lineTo(5f, 13.26f)
                curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                lineTo(20f, 19f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.96f, -1.25f, -3.62f, -3f, -4.24f)
                close()
                moveTo(17f, 5f)
                lineTo(17f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 2.17f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                close()
                moveTo(11f, 13f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 2.17f)
                lineTo(9f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                close()
                moveTo(6.5f, 15f)
                horizontalLineToRelative(11f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                lineTo(4.05f, 17f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                close()
            }
        }.also { _Chair = it}
