package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vault: ImageVector? = null

val Icons.Sr.Vault: ImageVector
    get() = _Vault ?: UXIcon(name = "Vault") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.86f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
                horizontalLineToRelative(-2.86f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.05f, -1.24f, 3.8f, -3f, 4.58f)
                verticalLineToRelative(1.42f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                lineTo(5f, 22f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.42f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                lineTo(2f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(0f, 15f)
                verticalLineToRelative(-6f)
                lineTo(2f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _Vault = it}
