package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Tr.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.39f, 9.75f)
                lineToRelative(-3.75f, -6.5f)
                curveToRelative(-0.8f, -1.39f, -2.29f, -2.25f, -3.9f, -2.25f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.6f, 0f, -3.1f, 0.86f, -3.9f, 2.25f)
                lineTo(0.59f, 9.75f)
                curveToRelative(-0.8f, 1.39f, -0.8f, 3.11f, 0f, 4.5f)
                lineToRelative(3.75f, 6.5f)
                curveToRelative(0.8f, 1.39f, 2.29f, 2.25f, 3.9f, 2.25f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.6f, 0f, 3.1f, -0.86f, 3.9f, -2.25f)
                lineToRelative(3.75f, -6.5f)
                curveToRelative(0.8f, -1.39f, 0.8f, -3.11f, 0f, -4.5f)
                close()
                moveTo(22.52f, 13.75f)
                lineToRelative(-3.75f, 6.5f)
                curveToRelative(-0.62f, 1.08f, -1.78f, 1.75f, -3.03f, 1.75f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.25f, 0f, -2.41f, -0.67f, -3.03f, -1.75f)
                lineToRelative(-3.75f, -6.5f)
                curveToRelative(-0.62f, -1.08f, -0.62f, -2.42f, 0f, -3.5f)
                lineToRelative(3.75f, -6.5f)
                curveToRelative(0.62f, -1.08f, 1.78f, -1.75f, 3.03f, -1.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.25f, 0f, 2.41f, 0.67f, 3.03f, 1.75f)
                lineToRelative(3.75f, 6.5f)
                curveToRelative(0.62f, 1.08f, 0.62f, 2.42f, 0f, 3.5f)
                close()
                moveTo(11.5f, 13.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _HexagonExclamation = it}
